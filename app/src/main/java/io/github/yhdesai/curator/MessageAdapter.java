package io.github.yhdesai.curator;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.codewaves.youtubethumbnailview.ThumbnailLoader;
import com.codewaves.youtubethumbnailview.ThumbnailView;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubeStandalonePlayer;
import com.google.android.youtube.player.YouTubeThumbnailLoader;
import com.google.android.youtube.player.YouTubeThumbnailView;

import java.util.List;

import static java.lang.Integer.parseInt;

public class MessageAdapter extends ArrayAdapter<FriendlyMessage> {

    private static final int REQ_START_STANDALONE_PLAYER = 1;
    private static final int REQ_RESOLVE_SERVICE_MISSING = 2;
    private static final String TAG = "MyActivity";
    private Button playButton;


    public MessageAdapter(Context context, int resource, List<FriendlyMessage> objects) {
        super(context, resource, objects);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = ((Activity) getContext()).getLayoutInflater().inflate(R.layout.item_message, parent, false);
        }

        ImageView photoImageView = (ImageView) convertView.findViewById(R.id.photoImageView);
        TextView videoNameTextView = (TextView) convertView.findViewById(R.id.videoNameTextView);
        TextView videoTokenTextView = (TextView) convertView.findViewById(R.id.videoTokenTextView);
        Button playButton = (Button) convertView.findViewById(R.id.playButton);
        ThumbnailView thumb = (ThumbnailView) convertView.findViewById(R.id.thumbnail);

        FriendlyMessage message = getItem(position);

// for displaying the name and the token
        videoNameTextView.setText(message.getText());
        videoTokenTextView.setText(message.getName());

        ThumbnailLoader.initialize(DeveloperKey.DEVELOPER_KEY);
        thumb.loadThumbnail("https://www.youtube.com/watch?v=" + message.getName());




return convertView;

}}


// Intent intent = YouTubeStandalonePlayer.createVideoIntent(this, DeveloperKey.DEVELOPER_KEY, message.getName());
/*
        String url = "https://img.youtube.com/vi/" + message.getName() + "/default.jpg"

      //  String url = "https://img.youtube.com/vi/"+videoURL.split("\\=")[1]+"/0.jpg";
        Glide.with(this).load(url).into(imageView);
*/
// for loading the thumbnail

        /*
        final YouTubeThumbnailView youTubeThumbnailView = (YouTubeThumbnailView) convertView.findViewById(R.id.thumbnail);
        youTubeThumbnailView.initialize(DeveloperKey.DEVELOPER_KEY, new YouTubeThumbnailView.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubeThumbnailView youTubeThumbnailView, final YouTubeThumbnailLoader youTubeThumbnailLoader) {
                youTubeThumbnailLoader.setVideo(token);
                youTubeThumbnailLoader.setOnThumbnailLoadedListener(new YouTubeThumbnailLoader.OnThumbnailLoadedListener() {
                    @Override
                    public void onThumbnailLoaded(YouTubeThumbnailView youTubeThumbnailView, String s) {
                        youTubeThumbnailLoader.release();
                    }

                    @Override
                    public void onThumbnailError(YouTubeThumbnailView youTubeThumbnailView, YouTubeThumbnailLoader.ErrorReason errorReason) {

                    }
                });
            }

            @Override
            public void onInitializationFailure(YouTubeThumbnailView youTubeThumbnailView, YouTubeInitializationResult youTubeInitializationResult) {

            }
        });


        */


//playButton.setOnClickListener(activity);
// playPlaylistButton.setOnClickListener(this);



        /*
        boolean isPhoto = message.getPhotoUrl() != null;
        if (isPhoto) {
            videoNameTextView.setVisibility(View.GONE);
            photoImageView.setVisibility(View.VISIBLE);
            Glide.with(photoImageView.getContext())
                    .load(message.getPhotoUrl())
                    .into(photoImageView);
        } else {
            videoNameTextView.setVisibility(View.VISIBLE);
            photoImageView.setVisibility(View.GONE);
            videoNameTextView.setText(message.getText());
        }

        */

/*
        videoNameTextView.setText(message.getText());
        videoTokenTextView.setText(message.getName());


        return convertView;
    }

}
*/
/*
    public void onClick extends Activity(View view) {




        Intent intent = null;

        intent = YouTubeStandalonePlayer.createVideoIntent(MainActivity, DeveloperKey.DEVELOPER_KEY, VIDEO_ID);


        if (intent != null) {
            if (canResolveIntent(intent)) {
                startActivityForResult(intent, REQ_START_STANDALONE_PLAYER);
            } else {
                // Could not resolve the intent - must need to install or update the YouTube API service.
                YouTubeInitializationResult.SERVICE_MISSING
                        .getErrorDialog(MainActivity, REQ_RESOLVE_SERVICE_MISSING).show();
            }
        }


    }
*/




package com.example.arsalan.k_books;

import android.content.Context;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.example.arsalan.k_books.model.Books;

import java.util.List;

public class BooksAdapter extends RecyclerView.Adapter<BooksAdapter.BooksViewHolder> {
    private Context mCtx;
    private List<Books> booksList;

    public BooksAdapter(Context mCtx, List<Books> booksList) {
        this.mCtx = mCtx;
        this.booksList = booksList;
    }

    @Override
    public BooksViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view=LayoutInflater.from(mCtx).inflate(R.layout.book_layout,viewGroup,false);
        return new BooksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final BooksViewHolder booksViewHolder, int position) {
        Books books=booksList.get(position);

        booksViewHolder.bookTitle.setText(books.getmBookTitle());
        booksViewHolder.bookdescrip.setText(books.getmBookDescription());
        //set book image,rating,favouriteimg
        //booksViewHolder.favouriteImg.setColorFilter(Color.YELLOW);
        booksViewHolder.ratingBar.setRating(books.getmBookRating());

        if(books.ismBookFavourite()){
            booksViewHolder.favouriteImg.setImageResource(R.drawable.ic_favorite_filled);
        }
        booksViewHolder.favouriteImg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });


    }


    @Override
    public int getItemCount() {
        return booksList.size();
    }

    class BooksViewHolder extends RecyclerView.ViewHolder{
        TextView bookTitle,bookdescrip;
        ImageView bookImg,star1,star2,star3,star4,star5,favouriteImg;
        RatingBar ratingBar;

        public BooksViewHolder(View itemView){
            super(itemView);

            bookTitle=itemView.findViewById(R.id.book_title);
            bookdescrip=itemView.findViewById(R.id.book_descrip);
            bookImg=itemView.findViewById(R.id.book_img);
            favouriteImg=itemView.findViewById(R.id.favourite_img);
            ratingBar=itemView.findViewById(R.id.ratingBar);
//            star1=itemView.findViewById(R.id.rate_star1);
//            star2=itemView.findViewById(R.id.rate_star2);
//            star3=itemView.findViewById(R.id.rate_star3);
//            star4=itemView.findViewById(R.id.rate_star4);
//            star5=itemView.findViewById(R.id.rate_star5);

        }

    }

}

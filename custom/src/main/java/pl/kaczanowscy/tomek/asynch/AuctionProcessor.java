package pl.kaczanowscy.tomek.asynch;

public interface AuctionProcessor {
	AuctionState process(Item item, int bid);
}

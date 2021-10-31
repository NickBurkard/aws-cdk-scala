package io.burkard.cdk.services.gamelift

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationProperty {

  def apply(
    destinationArn: Option[String] = None
  ): software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty =
    (new software.amazon.awscdk.services.gamelift.CfnGameSessionQueue.DestinationProperty.Builder)
      .destinationArn(destinationArn.orNull)
      .build()
}

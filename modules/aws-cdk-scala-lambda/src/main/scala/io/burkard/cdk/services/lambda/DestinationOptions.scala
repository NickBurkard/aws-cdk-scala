package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationOptions {

  def apply(
    `type`: Option[software.amazon.awscdk.services.lambda.DestinationType] = None
  ): software.amazon.awscdk.services.lambda.DestinationOptions =
    (new software.amazon.awscdk.services.lambda.DestinationOptions.Builder)
      .`type`(`type`.orNull)
      .build()
}

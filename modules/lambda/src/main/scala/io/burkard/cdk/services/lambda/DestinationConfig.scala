package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object DestinationConfig {

  def apply(
    destination: Option[String] = None
  ): software.amazon.awscdk.services.lambda.DestinationConfig =
    (new software.amazon.awscdk.services.lambda.DestinationConfig.Builder)
      .destination(destination.orNull)
      .build()
}

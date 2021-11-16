package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationConfig {

  def apply(
    destination: String
  ): software.amazon.awscdk.services.lambda.DestinationConfig =
    (new software.amazon.awscdk.services.lambda.DestinationConfig.Builder)
      .destination(destination)
      .build()
}

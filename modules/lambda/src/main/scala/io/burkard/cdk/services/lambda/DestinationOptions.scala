package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object DestinationOptions {

  def apply(
    `type`: software.amazon.awscdk.services.lambda.DestinationType
  ): software.amazon.awscdk.services.lambda.DestinationOptions =
    (new software.amazon.awscdk.services.lambda.DestinationOptions.Builder)
      .`type`(`type`)
      .build()
}

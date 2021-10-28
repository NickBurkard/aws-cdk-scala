package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaDestinationOptions {

  def apply(
    responseOnly: Option[Boolean] = None
  ): software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions =
    (new software.amazon.awscdk.services.lambda.destinations.LambdaDestinationOptions.Builder)
      .responseOnly(responseOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

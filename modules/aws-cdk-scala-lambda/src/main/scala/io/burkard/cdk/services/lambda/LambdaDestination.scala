package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object LambdaDestination {

  def apply(
    fn: software.amazon.awscdk.services.lambda.IFunction,
    responseOnly: Option[Boolean] = None
  ): software.amazon.awscdk.services.lambda.destinations.LambdaDestination =
    software.amazon.awscdk.services.lambda.destinations.LambdaDestination.Builder
      .create(fn)
      .responseOnly(responseOnly.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

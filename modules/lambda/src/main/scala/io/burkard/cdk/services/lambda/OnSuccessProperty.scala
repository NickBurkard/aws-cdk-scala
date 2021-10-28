package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OnSuccessProperty {

  def apply(
    destination: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.Builder)
      .destination(destination.orNull)
      .build()
}

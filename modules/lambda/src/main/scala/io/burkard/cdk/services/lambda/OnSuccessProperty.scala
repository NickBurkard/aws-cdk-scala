package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnSuccessProperty {

  def apply(
    destination: String
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnSuccessProperty.Builder)
      .destination(destination)
      .build()
}

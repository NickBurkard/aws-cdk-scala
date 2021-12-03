package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object OnFailureProperty {

  def apply(
    destination: String
  ): software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty =
    (new software.amazon.awscdk.services.lambda.CfnEventInvokeConfig.OnFailureProperty.Builder)
      .destination(destination)
      .build()
}

package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FunctionAssociation {

  def apply(
    eventType: software.amazon.awscdk.services.cloudfront.FunctionEventType,
    function: software.amazon.awscdk.services.cloudfront.IFunction
  ): software.amazon.awscdk.services.cloudfront.FunctionAssociation =
    (new software.amazon.awscdk.services.cloudfront.FunctionAssociation.Builder)
      .eventType(eventType)
      .function(function)
      .build()
}

package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FunctionAssociation {

  def apply(
    eventType: Option[software.amazon.awscdk.services.cloudfront.FunctionEventType] = None,
    function: Option[software.amazon.awscdk.services.cloudfront.IFunction] = None
  ): software.amazon.awscdk.services.cloudfront.FunctionAssociation =
    (new software.amazon.awscdk.services.cloudfront.FunctionAssociation.Builder)
      .eventType(eventType.orNull)
      .function(function.orNull)
      .build()
}

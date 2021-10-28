package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FieldToMatchProperty {

  def apply(
    uriPath: Option[AnyRef] = None,
    method: Option[AnyRef] = None,
    singleHeader: Option[AnyRef] = None,
    queryString: Option[AnyRef] = None,
    jsonBody: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty =
    (new software.amazon.awscdk.services.wafv2.CfnLoggingConfiguration.FieldToMatchProperty.Builder)
      .uriPath(uriPath.orNull)
      .method(method.orNull)
      .singleHeader(singleHeader.orNull)
      .queryString(queryString.orNull)
      .jsonBody(jsonBody.orNull)
      .build()
}

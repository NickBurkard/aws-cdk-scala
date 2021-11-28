package io.burkard.cdk.services.wafv2

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object FieldToMatchProperty {

  def apply(
    uriPath: Option[AnyRef] = None,
    allQueryArguments: Option[AnyRef] = None,
    singleHeader: Option[AnyRef] = None,
    queryString: Option[AnyRef] = None,
    jsonBody: Option[software.amazon.awscdk.services.wafv2.CfnRuleGroup.JsonBodyProperty] = None,
    singleQueryArgument: Option[AnyRef] = None,
    method: Option[AnyRef] = None,
    body: Option[AnyRef] = None
  ): software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty =
    (new software.amazon.awscdk.services.wafv2.CfnRuleGroup.FieldToMatchProperty.Builder)
      .uriPath(uriPath.orNull)
      .allQueryArguments(allQueryArguments.orNull)
      .singleHeader(singleHeader.orNull)
      .queryString(queryString.orNull)
      .jsonBody(jsonBody.orNull)
      .singleQueryArgument(singleQueryArgument.orNull)
      .method(method.orNull)
      .body(body.orNull)
      .build()
}

package io.burkard.cdk.services.apigateway

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnModelV2Props {

  def apply(
    name: String,
    apiId: String,
    schema: AnyRef,
    description: Option[String] = None,
    contentType: Option[String] = None
  ): software.amazon.awscdk.services.apigateway.CfnModelV2Props =
    (new software.amazon.awscdk.services.apigateway.CfnModelV2Props.Builder)
      .name(name)
      .apiId(apiId)
      .schema(schema)
      .description(description.orNull)
      .contentType(contentType.orNull)
      .build()
}

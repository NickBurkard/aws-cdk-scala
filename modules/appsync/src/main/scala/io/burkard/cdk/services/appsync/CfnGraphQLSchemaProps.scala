package io.burkard.cdk.services.appsync

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnGraphQLSchemaProps {

  def apply(
    apiId: String,
    definitionS3Location: Option[String] = None,
    definition: Option[String] = None
  ): software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps =
    (new software.amazon.awscdk.services.appsync.CfnGraphQLSchemaProps.Builder)
      .apiId(apiId)
      .definitionS3Location(definitionS3Location.orNull)
      .definition(definition.orNull)
      .build()
}

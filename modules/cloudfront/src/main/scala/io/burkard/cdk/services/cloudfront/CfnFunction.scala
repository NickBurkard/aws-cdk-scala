package io.burkard.cdk.services.cloudfront

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnFunction {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    functionMetadata: Option[software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionMetadataProperty] = None,
    functionCode: Option[String] = None,
    autoPublish: Option[Boolean] = None,
    functionConfig: Option[software.amazon.awscdk.services.cloudfront.CfnFunction.FunctionConfigProperty] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.cloudfront.CfnFunction =
    software.amazon.awscdk.services.cloudfront.CfnFunction.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .functionMetadata(functionMetadata.orNull)
      .functionCode(functionCode.orNull)
      .autoPublish(autoPublish.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .functionConfig(functionConfig.orNull)
      .build()
}

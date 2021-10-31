package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionPermission {

  def apply(
    internalResourceId: String,
    layerVersionArn: Option[String] = None,
    principal: Option[String] = None,
    organizationId: Option[String] = None,
    action: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.lambda.CfnLayerVersionPermission =
    software.amazon.awscdk.services.lambda.CfnLayerVersionPermission.Builder
      .create(stackCtx, internalResourceId)
      .layerVersionArn(layerVersionArn.orNull)
      .principal(principal.orNull)
      .organizationId(organizationId.orNull)
      .action(action.orNull)
      .build()
}

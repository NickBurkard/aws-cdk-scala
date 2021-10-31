package io.burkard.cdk.services.lambda

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnLayerVersionPermissionProps {

  def apply(
    layerVersionArn: Option[String] = None,
    principal: Option[String] = None,
    organizationId: Option[String] = None,
    action: Option[String] = None
  ): software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps =
    (new software.amazon.awscdk.services.lambda.CfnLayerVersionPermissionProps.Builder)
      .layerVersionArn(layerVersionArn.orNull)
      .principal(principal.orNull)
      .organizationId(organizationId.orNull)
      .action(action.orNull)
      .build()
}

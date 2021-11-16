package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMitigationAction {

  def apply(
    internalResourceId: String,
    actionParams: software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    actionName: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.iot.CfnMitigationAction =
    software.amazon.awscdk.services.iot.CfnMitigationAction.Builder
      .create(stackCtx, internalResourceId)
      .actionParams(actionParams)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .actionName(actionName.orNull)
      .build()
}

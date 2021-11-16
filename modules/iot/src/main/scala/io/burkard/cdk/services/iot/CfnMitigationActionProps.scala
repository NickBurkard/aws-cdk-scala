package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnMitigationActionProps {

  def apply(
    actionParams: software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty,
    roleArn: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationActionProps =
    (new software.amazon.awscdk.services.iot.CfnMitigationActionProps.Builder)
      .actionParams(actionParams)
      .roleArn(roleArn)
      .tags(tags.map(_.asJava).orNull)
      .actionName(actionName.orNull)
      .build()
}

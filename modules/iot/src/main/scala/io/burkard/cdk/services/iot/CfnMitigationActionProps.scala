package io.burkard.cdk.services.iot

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnMitigationActionProps {

  def apply(
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    actionParams: Option[software.amazon.awscdk.services.iot.CfnMitigationAction.ActionParamsProperty] = None,
    roleArn: Option[String] = None,
    actionName: Option[String] = None
  ): software.amazon.awscdk.services.iot.CfnMitigationActionProps =
    (new software.amazon.awscdk.services.iot.CfnMitigationActionProps.Builder)
      .tags(tags.map(_.asJava).orNull)
      .actionParams(actionParams.orNull)
      .roleArn(roleArn.orNull)
      .actionName(actionName.orNull)
      .build()
}

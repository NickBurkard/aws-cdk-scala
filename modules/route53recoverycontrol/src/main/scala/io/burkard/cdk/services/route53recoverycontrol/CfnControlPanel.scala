package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnControlPanel {

  def apply(
    internalResourceId: String,
    name: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    clusterArn: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel =
    software.amazon.awscdk.services.route53recoverycontrol.CfnControlPanel.Builder
      .create(stackCtx, internalResourceId)
      .name(name)
      .tags(tags.map(_.asJava).orNull)
      .clusterArn(clusterArn.orNull)
      .build()
}

package io.burkard.cdk.services.route53recoverycontrol

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnClusterProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  ): software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps =
    (new software.amazon.awscdk.services.route53recoverycontrol.CfnClusterProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

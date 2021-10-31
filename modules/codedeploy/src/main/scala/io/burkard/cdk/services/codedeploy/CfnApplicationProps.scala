package io.burkard.cdk.services.codedeploy

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnApplicationProps {

  def apply(
    computePlatform: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    applicationName: Option[String] = None
  ): software.amazon.awscdk.services.codedeploy.CfnApplicationProps =
    (new software.amazon.awscdk.services.codedeploy.CfnApplicationProps.Builder)
      .computePlatform(computePlatform.orNull)
      .tags(tags.map(_.asJava).orNull)
      .applicationName(applicationName.orNull)
      .build()
}

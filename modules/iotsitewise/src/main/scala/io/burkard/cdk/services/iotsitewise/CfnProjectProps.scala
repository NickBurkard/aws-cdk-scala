package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    projectName: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    portalId: Option[String] = None,
    projectDescription: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnProjectProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnProjectProps.Builder)
      .projectName(projectName.orNull)
      .tags(tags.map(_.asJava).orNull)
      .portalId(portalId.orNull)
      .projectDescription(projectDescription.orNull)
      .build()
}

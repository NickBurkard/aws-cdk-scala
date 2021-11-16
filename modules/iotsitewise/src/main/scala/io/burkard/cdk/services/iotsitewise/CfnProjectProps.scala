package io.burkard.cdk.services.iotsitewise

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnProjectProps {

  def apply(
    projectName: String,
    portalId: String,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    projectDescription: Option[String] = None
  ): software.amazon.awscdk.services.iotsitewise.CfnProjectProps =
    (new software.amazon.awscdk.services.iotsitewise.CfnProjectProps.Builder)
      .projectName(projectName)
      .portalId(portalId)
      .tags(tags.map(_.asJava).orNull)
      .projectDescription(projectDescription.orNull)
      .build()
}

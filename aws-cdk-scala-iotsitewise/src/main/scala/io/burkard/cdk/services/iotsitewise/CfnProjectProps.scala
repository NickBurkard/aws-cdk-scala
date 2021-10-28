package io.burkard.cdk.services.iotsitewise

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
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

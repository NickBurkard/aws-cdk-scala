package io.burkard.cdk.services.codebuild

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object BatchRestrictionsProperty {

  def apply(
    maximumBuildsAllowed: Option[Number] = None,
    computeTypesAllowed: Option[List[String]] = None
  ): software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty =
    (new software.amazon.awscdk.services.codebuild.CfnProject.BatchRestrictionsProperty.Builder)
      .maximumBuildsAllowed(maximumBuildsAllowed.orNull)
      .computeTypesAllowed(computeTypesAllowed.map(_.asJava).orNull)
      .build()
}

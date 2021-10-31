package io.burkard.cdk.services.codebuild

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
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

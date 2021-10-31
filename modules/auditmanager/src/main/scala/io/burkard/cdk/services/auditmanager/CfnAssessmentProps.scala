package io.burkard.cdk.services.auditmanager

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssessmentProps {

  def apply(
    name: Option[String] = None,
    frameworkId: Option[String] = None,
    status: Option[String] = None,
    awsAccount: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty] = None,
    description: Option[String] = None,
    scope: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assessmentReportsDestination: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty] = None,
    roles: Option[List[_]] = None
  ): software.amazon.awscdk.services.auditmanager.CfnAssessmentProps =
    (new software.amazon.awscdk.services.auditmanager.CfnAssessmentProps.Builder)
      .name(name.orNull)
      .frameworkId(frameworkId.orNull)
      .status(status.orNull)
      .awsAccount(awsAccount.orNull)
      .description(description.orNull)
      .scope(scope.orNull)
      .tags(tags.map(_.asJava).orNull)
      .assessmentReportsDestination(assessmentReportsDestination.orNull)
      .roles(roles.map(_.asJava).orNull)
      .build()
}

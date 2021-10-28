package io.burkard.cdk.services.auditmanager

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnAssessment {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    frameworkId: Option[String] = None,
    status: Option[String] = None,
    awsAccount: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.AWSAccountProperty] = None,
    description: Option[String] = None,
    scope: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.ScopeProperty] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    assessmentReportsDestination: Option[software.amazon.awscdk.services.auditmanager.CfnAssessment.AssessmentReportsDestinationProperty] = None,
    roles: Option[List[_]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.auditmanager.CfnAssessment =
    software.amazon.awscdk.services.auditmanager.CfnAssessment.Builder
      .create(stackCtx, internalResourceId)
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

package io.burkard.cdk.services.ssm

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnAssociation {

  def apply(
    internalResourceId: String,
    documentVersion: Option[String] = None,
    name: Option[String] = None,
    targets: Option[List[_]] = None,
    applyOnlyAtCronInterval: Option[Boolean] = None,
    complianceSeverity: Option[String] = None,
    automationTargetParameterName: Option[String] = None,
    maxErrors: Option[String] = None,
    calendarNames: Option[List[String]] = None,
    parameters: Option[Map[String, _]] = None,
    instanceId: Option[String] = None,
    waitForSuccessTimeoutSeconds: Option[Number] = None,
    associationName: Option[String] = None,
    syncCompliance: Option[String] = None,
    maxConcurrency: Option[String] = None,
    outputLocation: Option[software.amazon.awscdk.services.ssm.CfnAssociation.InstanceAssociationOutputLocationProperty] = None,
    scheduleExpression: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.ssm.CfnAssociation =
    software.amazon.awscdk.services.ssm.CfnAssociation.Builder
      .create(stackCtx, internalResourceId)
      .documentVersion(documentVersion.orNull)
      .name(name.orNull)
      .targets(targets.map(_.asJava).orNull)
      .applyOnlyAtCronInterval(applyOnlyAtCronInterval.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .complianceSeverity(complianceSeverity.orNull)
      .automationTargetParameterName(automationTargetParameterName.orNull)
      .maxErrors(maxErrors.orNull)
      .calendarNames(calendarNames.map(_.asJava).orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .instanceId(instanceId.orNull)
      .waitForSuccessTimeoutSeconds(waitForSuccessTimeoutSeconds.orNull)
      .associationName(associationName.orNull)
      .syncCompliance(syncCompliance.orNull)
      .maxConcurrency(maxConcurrency.orNull)
      .outputLocation(outputLocation.orNull)
      .scheduleExpression(scheduleExpression.orNull)
      .build()
}

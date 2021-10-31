package io.burkard.cdk.core

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnStackSet {

  def apply(
    internalResourceId: String,
    stackSetName: Option[String] = None,
    autoDeployment: Option[software.amazon.awscdk.CfnStackSet.AutoDeploymentProperty] = None,
    stackInstancesGroup: Option[List[_]] = None,
    templateUrl: Option[String] = None,
    templateBody: Option[String] = None,
    operationPreferences: Option[software.amazon.awscdk.CfnStackSet.OperationPreferencesProperty] = None,
    parameters: Option[List[_]] = None,
    permissionModel: Option[String] = None,
    callAs: Option[String] = None,
    executionRoleName: Option[String] = None,
    capabilities: Option[List[String]] = None,
    description: Option[String] = None,
    administrationRoleArn: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.CfnStackSet =
    software.amazon.awscdk.CfnStackSet.Builder
      .create(stackCtx, internalResourceId)
      .stackSetName(stackSetName.orNull)
      .autoDeployment(autoDeployment.orNull)
      .stackInstancesGroup(stackInstancesGroup.map(_.asJava).orNull)
      .templateUrl(templateUrl.orNull)
      .templateBody(templateBody.orNull)
      .operationPreferences(operationPreferences.orNull)
      .parameters(parameters.map(_.asJava).orNull)
      .permissionModel(permissionModel.orNull)
      .callAs(callAs.orNull)
      .executionRoleName(executionRoleName.orNull)
      .capabilities(capabilities.map(_.asJava).orNull)
      .description(description.orNull)
      .administrationRoleArn(administrationRoleArn.orNull)
      .tags(tags.map(_.asJava).orNull)
      .build()
}

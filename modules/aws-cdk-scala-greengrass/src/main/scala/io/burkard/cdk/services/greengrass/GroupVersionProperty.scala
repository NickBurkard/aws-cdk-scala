package io.burkard.cdk.services.greengrass

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object GroupVersionProperty {

  def apply(
    coreDefinitionVersionArn: Option[String] = None,
    functionDefinitionVersionArn: Option[String] = None,
    deviceDefinitionVersionArn: Option[String] = None,
    subscriptionDefinitionVersionArn: Option[String] = None,
    resourceDefinitionVersionArn: Option[String] = None,
    connectorDefinitionVersionArn: Option[String] = None,
    loggerDefinitionVersionArn: Option[String] = None
  ): software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty =
    (new software.amazon.awscdk.services.greengrass.CfnGroup.GroupVersionProperty.Builder)
      .coreDefinitionVersionArn(coreDefinitionVersionArn.orNull)
      .functionDefinitionVersionArn(functionDefinitionVersionArn.orNull)
      .deviceDefinitionVersionArn(deviceDefinitionVersionArn.orNull)
      .subscriptionDefinitionVersionArn(subscriptionDefinitionVersionArn.orNull)
      .resourceDefinitionVersionArn(resourceDefinitionVersionArn.orNull)
      .connectorDefinitionVersionArn(connectorDefinitionVersionArn.orNull)
      .loggerDefinitionVersionArn(loggerDefinitionVersionArn.orNull)
      .build()
}

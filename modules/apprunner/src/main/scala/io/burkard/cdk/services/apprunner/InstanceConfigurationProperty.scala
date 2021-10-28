package io.burkard.cdk.services.apprunner

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object InstanceConfigurationProperty {

  def apply(
    instanceRoleArn: Option[String] = None,
    cpu: Option[String] = None,
    memory: Option[String] = None
  ): software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty =
    (new software.amazon.awscdk.services.apprunner.CfnService.InstanceConfigurationProperty.Builder)
      .instanceRoleArn(instanceRoleArn.orNull)
      .cpu(cpu.orNull)
      .memory(memory.orNull)
      .build()
}

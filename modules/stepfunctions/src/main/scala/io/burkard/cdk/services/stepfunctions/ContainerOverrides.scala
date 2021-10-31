package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ContainerOverrides {

  def apply(
    vcpus: Option[Number] = None,
    gpuCount: Option[Number] = None,
    command: Option[List[String]] = None,
    instanceType: Option[software.amazon.awscdk.services.ec2.InstanceType] = None,
    environment: Option[Map[String, String]] = None,
    memory: Option[Number] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides =
    (new software.amazon.awscdk.services.stepfunctions.tasks.ContainerOverrides.Builder)
      .vcpus(vcpus.orNull)
      .gpuCount(gpuCount.orNull)
      .command(command.map(_.asJava).orNull)
      .instanceType(instanceType.orNull)
      .environment(environment.map(_.asJava).orNull)
      .memory(memory.orNull)
      .build()
}

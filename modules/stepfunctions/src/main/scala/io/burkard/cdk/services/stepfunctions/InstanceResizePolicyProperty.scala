package io.burkard.cdk.services.stepfunctions

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object InstanceResizePolicyProperty {

  def apply(
    instanceTerminationTimeout: Option[software.amazon.awscdk.Duration] = None,
    instancesToProtect: Option[List[String]] = None,
    instancesToTerminate: Option[List[String]] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty =
    (new software.amazon.awscdk.services.stepfunctions.tasks.EmrModifyInstanceGroupByName.InstanceResizePolicyProperty.Builder)
      .instanceTerminationTimeout(instanceTerminationTimeout.orNull)
      .instancesToProtect(instancesToProtect.map(_.asJava).orNull)
      .instancesToTerminate(instancesToTerminate.map(_.asJava).orNull)
      .build()
}

package io.burkard.cdk.services.batch

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object ResourceRequirementProperty {

  def apply(
    `type`: Option[String] = None,
    value: Option[String] = None
  ): software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty =
    (new software.amazon.awscdk.services.batch.CfnJobDefinition.ResourceRequirementProperty.Builder)
      .`type`(`type`.orNull)
      .value(value.orNull)
      .build()
}

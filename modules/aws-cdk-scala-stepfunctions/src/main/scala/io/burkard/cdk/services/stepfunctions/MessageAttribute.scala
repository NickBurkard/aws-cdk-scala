package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object MessageAttribute {

  def apply(
    dataType: Option[software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType] = None,
    value: Option[AnyRef] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute =
    (new software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.Builder)
      .dataType(dataType.orNull)
      .value(value.orNull)
      .build()
}

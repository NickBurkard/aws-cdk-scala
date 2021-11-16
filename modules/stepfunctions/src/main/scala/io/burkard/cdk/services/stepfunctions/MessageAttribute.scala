package io.burkard.cdk.services.stepfunctions

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object MessageAttribute {

  def apply(
    value: AnyRef,
    dataType: Option[software.amazon.awscdk.services.stepfunctions.tasks.MessageAttributeDataType] = None
  ): software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute =
    (new software.amazon.awscdk.services.stepfunctions.tasks.MessageAttribute.Builder)
      .value(value)
      .dataType(dataType.orNull)
      .build()
}

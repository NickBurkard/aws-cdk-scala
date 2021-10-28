package io.burkard.cdk.services.customerprofiles

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object FieldMapProperty {

  def apply(
    name: Option[String] = None,
    objectTypeField: Option[software.amazon.awscdk.services.customerprofiles.CfnObjectType.ObjectTypeFieldProperty] = None
  ): software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty =
    (new software.amazon.awscdk.services.customerprofiles.CfnObjectType.FieldMapProperty.Builder)
      .name(name.orNull)
      .objectTypeField(objectTypeField.orNull)
      .build()
}
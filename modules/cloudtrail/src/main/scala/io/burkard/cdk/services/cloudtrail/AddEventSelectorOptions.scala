package io.burkard.cdk.services.cloudtrail

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object AddEventSelectorOptions {

  def apply(
    readWriteType: Option[software.amazon.awscdk.services.cloudtrail.ReadWriteType] = None,
    includeManagementEvents: Option[Boolean] = None
  ): software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions =
    (new software.amazon.awscdk.services.cloudtrail.AddEventSelectorOptions.Builder)
      .readWriteType(readWriteType.orNull)
      .includeManagementEvents(includeManagementEvents.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .build()
}

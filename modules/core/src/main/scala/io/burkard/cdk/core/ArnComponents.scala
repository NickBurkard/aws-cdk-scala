package io.burkard.cdk.core

@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArnComponents {

  def apply(
    service: String,
    resource: String,
    partition: Option[String] = None,
    resourceName: Option[String] = None,
    arnFormat: Option[software.amazon.awscdk.ArnFormat] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.ArnComponents =
    (new software.amazon.awscdk.ArnComponents.Builder)
      .service(service)
      .resource(resource)
      .partition(partition.orNull)
      .resourceName(resourceName.orNull)
      .arnFormat(arnFormat.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}

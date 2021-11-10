package io.burkard.cdk.core

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object ArnComponents {

  def apply(
    partition: Option[String] = None,
    service: Option[String] = None,
    sep: Option[String] = None,
    resourceName: Option[String] = None,
    resource: Option[String] = None,
    arnFormat: Option[software.amazon.awscdk.ArnFormat] = None,
    region: Option[String] = None,
    account: Option[String] = None
  ): software.amazon.awscdk.ArnComponents =
    (new software.amazon.awscdk.ArnComponents.Builder)
      .partition(partition.orNull)
      .service(service.orNull)
      .sep(sep.orNull)
      .resourceName(resourceName.orNull)
      .resource(resource.orNull)
      .arnFormat(arnFormat.orNull)
      .region(region.orNull)
      .account(account.orNull)
      .build()
}

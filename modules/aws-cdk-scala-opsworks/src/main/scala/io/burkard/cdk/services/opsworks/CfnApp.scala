package io.burkard.cdk.services.opsworks

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnApp {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    sslConfiguration: Option[software.amazon.awscdk.services.opsworks.CfnApp.SslConfigurationProperty] = None,
    shortname: Option[String] = None,
    description: Option[String] = None,
    domains: Option[List[String]] = None,
    attributes: Option[Map[String, String]] = None,
    stackId: Option[String] = None,
    appSource: Option[software.amazon.awscdk.services.opsworks.CfnApp.SourceProperty] = None,
    environment: Option[List[_]] = None,
    enableSsl: Option[Boolean] = None,
    dataSources: Option[List[_]] = None,
    `type`: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.opsworks.CfnApp =
    software.amazon.awscdk.services.opsworks.CfnApp.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .sslConfiguration(sslConfiguration.orNull)
      .shortname(shortname.orNull)
      .description(description.orNull)
      .domains(domains.map(_.asJava).orNull)
      .attributes(attributes.map(_.asJava).orNull)
      .stackId(stackId.orNull)
      .appSource(appSource.orNull)
      .environment(environment.map(_.asJava).orNull)
      .enableSsl(enableSsl.map(Boolean.box).getOrElse(java.lang.Boolean.FALSE))
      .dataSources(dataSources.map(_.asJava).orNull)
      .`type`(`type`.orNull)
      .build()
}

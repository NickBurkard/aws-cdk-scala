package io.burkard.cdk.services.kendra

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnDataSource {

  def apply(
    internalResourceId: String,
    name: Option[String] = None,
    `type`: Option[String] = None,
    description: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    roleArn: Option[String] = None,
    indexId: Option[String] = None,
    dataSourceConfiguration: Option[software.amazon.awscdk.services.kendra.CfnDataSource.DataSourceConfigurationProperty] = None,
    schedule: Option[String] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.kendra.CfnDataSource =
    software.amazon.awscdk.services.kendra.CfnDataSource.Builder
      .create(stackCtx, internalResourceId)
      .name(name.orNull)
      .`type`(`type`.orNull)
      .description(description.orNull)
      .tags(tags.map(_.asJava).orNull)
      .roleArn(roleArn.orNull)
      .indexId(indexId.orNull)
      .dataSourceConfiguration(dataSourceConfiguration.orNull)
      .schedule(schedule.orNull)
      .build()
}

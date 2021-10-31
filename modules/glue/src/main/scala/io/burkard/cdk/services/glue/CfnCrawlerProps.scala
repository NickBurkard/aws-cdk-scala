package io.burkard.cdk.services.glue

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
object CfnCrawlerProps {

  def apply(
    targets: Option[software.amazon.awscdk.services.glue.CfnCrawler.TargetsProperty] = None,
    schemaChangePolicy: Option[software.amazon.awscdk.services.glue.CfnCrawler.SchemaChangePolicyProperty] = None,
    recrawlPolicy: Option[software.amazon.awscdk.services.glue.CfnCrawler.RecrawlPolicyProperty] = None,
    schedule: Option[software.amazon.awscdk.services.glue.CfnCrawler.ScheduleProperty] = None,
    databaseName: Option[String] = None,
    name: Option[String] = None,
    crawlerSecurityConfiguration: Option[String] = None,
    tablePrefix: Option[String] = None,
    role: Option[String] = None,
    description: Option[String] = None,
    tags: Option[AnyRef] = None,
    configuration: Option[String] = None,
    classifiers: Option[List[String]] = None
  ): software.amazon.awscdk.services.glue.CfnCrawlerProps =
    (new software.amazon.awscdk.services.glue.CfnCrawlerProps.Builder)
      .targets(targets.orNull)
      .schemaChangePolicy(schemaChangePolicy.orNull)
      .recrawlPolicy(recrawlPolicy.orNull)
      .schedule(schedule.orNull)
      .databaseName(databaseName.orNull)
      .name(name.orNull)
      .crawlerSecurityConfiguration(crawlerSecurityConfiguration.orNull)
      .tablePrefix(tablePrefix.orNull)
      .role(role.orNull)
      .description(description.orNull)
      .tags(tags.orNull)
      .configuration(configuration.orNull)
      .classifiers(classifiers.map(_.asJava).orNull)
      .build()
}

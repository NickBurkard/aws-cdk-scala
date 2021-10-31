package io.burkard.cdk.services.datasync

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object CfnTaskProps {

  def apply(
    name: Option[String] = None,
    tags: Option[List[_ <: software.amazon.awscdk.CfnTag]] = None,
    sourceLocationArn: Option[String] = None,
    excludes: Option[List[_]] = None,
    options: Option[software.amazon.awscdk.services.datasync.CfnTask.OptionsProperty] = None,
    cloudWatchLogGroupArn: Option[String] = None,
    destinationLocationArn: Option[String] = None,
    schedule: Option[software.amazon.awscdk.services.datasync.CfnTask.TaskScheduleProperty] = None,
    includes: Option[List[_]] = None
  ): software.amazon.awscdk.services.datasync.CfnTaskProps =
    (new software.amazon.awscdk.services.datasync.CfnTaskProps.Builder)
      .name(name.orNull)
      .tags(tags.map(_.asJava).orNull)
      .sourceLocationArn(sourceLocationArn.orNull)
      .excludes(excludes.map(_.asJava).orNull)
      .options(options.orNull)
      .cloudWatchLogGroupArn(cloudWatchLogGroupArn.orNull)
      .destinationLocationArn(destinationLocationArn.orNull)
      .schedule(schedule.orNull)
      .includes(includes.map(_.asJava).orNull)
      .build()
}

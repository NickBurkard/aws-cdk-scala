package io.burkard.cdk.services.rds

import scala.jdk.CollectionConverters._

@SuppressWarnings(Array("org.wartremover.warts.Any", "org.wartremover.warts.Null"))
object OptionGroup {

  def apply(
    internalResourceId: String,
    description: Option[String] = None,
    configurations: Option[List[_ <: software.amazon.awscdk.services.rds.OptionConfiguration]] = None,
    engine: Option[software.amazon.awscdk.services.rds.IInstanceEngine] = None
  )(implicit stackCtx: software.amazon.awscdk.Stack): software.amazon.awscdk.services.rds.OptionGroup =
    software.amazon.awscdk.services.rds.OptionGroup.Builder
      .create(stackCtx, internalResourceId)
      .description(description.orNull)
      .configurations(configurations.map(_.asJava).orNull)
      .engine(engine.orNull)
      .build()
}

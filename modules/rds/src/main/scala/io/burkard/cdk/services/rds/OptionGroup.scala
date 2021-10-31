package io.burkard.cdk.services.rds

import scala.collection.JavaConverters._

@scala.annotation.nowarn("cat=deprecation")
@SuppressWarnings(Array("org.wartremover.warts.DefaultArguments", "org.wartremover.warts.Null", "DisableSyntax.null"))
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

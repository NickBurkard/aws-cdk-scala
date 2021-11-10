package io.burkard.cdk.services.lambda


sealed abstract class SourceMapMode(val underlying: software.amazon.awscdk.services.lambda.nodejs.SourceMapMode)
  extends Product
    with Serializable


object SourceMapMode {
  implicit def toAws(value: SourceMapMode): software.amazon.awscdk.services.lambda.nodejs.SourceMapMode =
    Option(value).map(_.underlying).orNull

  case object Default
    extends SourceMapMode(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.DEFAULT)

  case object External
    extends SourceMapMode(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.EXTERNAL)

  case object Inline
    extends SourceMapMode(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.INLINE)

  case object Both
    extends SourceMapMode(software.amazon.awscdk.services.lambda.nodejs.SourceMapMode.BOTH)
}
